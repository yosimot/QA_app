package jp.techacademy.takahiro.yoshimoto.qa_app;

import java.io.Serializable;

/**
 * Created by Yoshimoto Takahiro on 2017/02/11.
 */
public class Answer implements Serializable {
    private String mBody;
    private String mName;
    private String mUid;
    private String mAnswerUid;

    public Answer(String body, String name, String uid, String answerUid){
        mBody = body;
        mName = name;
        mUid = uid;
        mAnswerUid = answerUid;
    }

    public String getBody(){
        return mBody;
    }

    public String getName(){
        return mName;
    }

    public String getUid(){
        return mUid;
    }

    public String getmAnswerUid(){
        return mAnswerUid;
    }
}
