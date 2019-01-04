package com.mauto.repository.internal.state;

/**
 * Created by haohuidong on 19-1-4.
 */

public interface ObjectViewState extends CommonViewState {

    final class ObjectResult<T> implements ObjectViewState {
        private T t;

        public ObjectResult (T t) {
            this.t = t;
        }

        public T getResult() {
            return t;
        }
    }

}
