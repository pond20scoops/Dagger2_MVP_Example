package com.wisdomlanna.www.dagger2_mvp_example.ui;

import com.wisdomlanna.www.dagger2_mvp_example.dao.UserInfoDao;
import com.wisdomlanna.www.dagger2_mvp_example.ui.base.BaseInterface;

public class MainInterface {

    public interface View extends BaseInterface.View {
        void showResultPlus(int result);

        void showResultUserInfoGitHubApi(UserInfoDao dao);
    }

    interface Presenter {
        void plus(int x, int y);

        void loadUserInfo(String username);
    }
}