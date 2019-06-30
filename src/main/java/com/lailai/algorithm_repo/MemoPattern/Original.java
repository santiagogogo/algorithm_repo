package com.lailai.algorithm_repo.MemoPattern;

public class Original {
    private String sts;


    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public Original(String sts) {
        this.sts = sts;
    }

    Memo saveToMemo(Original sts){
        return new Memo(sts.getSts());
    }
    void getStsFromMemo(Memo memo){
        this.sts=memo.getSts();

    }
}
