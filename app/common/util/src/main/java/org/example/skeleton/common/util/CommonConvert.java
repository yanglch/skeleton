package org.example.skeleton.common.util;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public final class CommonConvert {
    public static void main(String[] args) {

    }

    public static <T, S> T convert(S source, Supplier<T> targetSupplier) {
        if (source == null) {
            return null;
        }
        T target = targetSupplier.get();
        BeanUtils.copyProperties(source, target);
        return target;
    }


    public static <T, S> List<T> convertList(List<S> sourceList, Supplier<T> targetSupplier) {
        if (CollectionUtils.isEmpty(sourceList)) {
            return Collections.emptyList();
        }

        List<T> targetList = new ArrayList<>();
        sourceList.forEach(source -> {
            targetList.add(convert(source, targetSupplier));
        });
        return targetList;
    }

}
