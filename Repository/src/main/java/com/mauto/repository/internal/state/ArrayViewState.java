package com.mauto.repository.internal.state;

import java.util.List;

/**
 * Created by haohuidong on 19-1-4.
 */

public interface ArrayViewState extends CommonViewState {

    final class ArrayResult<T> implements ArrayViewState {
        private List<T> arrayResult;

        public ArrayResult(List<T> arrayResult) {
            this.arrayResult = arrayResult;
        }

        public List<T> getResult() {
            return arrayResult;
        }
    }

}
