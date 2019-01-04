package com.mauto.repository.internal.state;

/**
 * Created by haohuidong on 19-1-4.
 */

public interface CommonViewState  {
    final class Loading implements CommonViewState{}

    final class Error implements CommonViewState {
        private Throwable err;

        public Error(Throwable err) {
            this.err = err;
        }

        public Throwable getError() {
            return err;
        }
    }

    final class Empty implements CommonViewState {}
}
