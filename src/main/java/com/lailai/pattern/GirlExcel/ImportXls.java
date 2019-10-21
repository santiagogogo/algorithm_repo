package com.lailai.pattern.GirlExcel;

import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
@RestController
public class ImportXls {


    @RequestMapping(value = "/copyXls", method = RequestMethod.GET)
    public void importXls(){
        String path="/Users/gedelai/Desktop/b";
        File file=new File(path);
        File[] array=file.listFiles();
        for(int i=0;i<array.length;i++) {
            if (array[i].isFile()) {
                String fileName = array[i].getName();
                if (fileName.endsWith(".xls")) {
                    String filepath=path+"/"+fileName;

                    readXls(filepath);


                }
            }
        }

    }

    /**
     * 俱乐部	俱乐部总经理	联系电话	俱乐部竞训负责人	联系方式	俱乐部新闻官	联系方式	俱乐部商务负责人	俱乐部工作邮箱
     * 会员协会秘书长	联系方式	会员协会竞训负责人	联系方式	会员协会接待人员
     * 联系方式	会员协会邮箱	赛区协会秘书长	联系方式	赛区协会竞训负责人	联系方式	赛区接待人员	联系方式
     * @param filepath
     */

    private void readXls(String filepath)  {
        try{
            ImportParams params = new ImportParams();
            params.setTitleRows(1);
            params.setHeadRows(1);
            FileInputStream in = new FileInputStream(filepath);

            POIFSFileSystem poiFileSystem = new POIFSFileSystem(in);
            Workbook workbook = new HSSFWorkbook(poiFileSystem);
            Sheet sheetAt = workbook.getSheetAt(0);
            String stringCellValue = sheetAt.getRow(3).getCell(1, Row.RETURN_BLANK_AS_NULL).getStringCellValue();
            System.out.println(stringCellValue);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        /**
        List<MsgClient> list = ExcelImportUtil.importExcel(
                new File(PoiPublicUtil.getWebRootPath("/Users/gedelai/Desktop/b")),
                MsgClient.class, params);
        System.out.println(new Date().getTime() - start);
        System.out.println(list.size());
        System.out.println(ReflectionToStringBuilder.toString(list.get(0)));
         */
    }
}
