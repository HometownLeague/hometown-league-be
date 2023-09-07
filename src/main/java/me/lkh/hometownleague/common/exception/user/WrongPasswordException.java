package me.lkh.hometownleague.common.exception.user;

import me.lkh.hometownleague.common.exception.ErrorCode;
import me.lkh.hometownleague.common.exception.HometownLeagueBaseException;

/**
 * 패스워드가 불일치 하는 경우 발생
 * @see ErrorCode
 */
public class WrongPasswordException extends HometownLeagueBaseException {
    public WrongPasswordException() {
        super(ErrorCode.WRONG_PASSWORD);
    }

    public WrongPasswordException(String message) {
        super(ErrorCode.WRONG_PASSWORD, message);
    }

    public WrongPasswordException(String message, Throwable cause) {
        super(ErrorCode.WRONG_PASSWORD, message, cause);
    }

    public WrongPasswordException(Throwable cause) {
        super(ErrorCode.WRONG_PASSWORD, cause);
    }

    public WrongPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(ErrorCode.WRONG_PASSWORD, message, cause, enableSuppression, writableStackTrace);
    }
}
