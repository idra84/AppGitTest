package com.functional.section11;

import com.functional.section10.Book;

import java.util.Spliterator;
import java.util.function.Consumer;

public class BookSpliterator implements Spliterator<Book> {

    @Override
    public boolean tryAdvance(Consumer<? super Book> action) {
        return false;
    }

    @Override
    public Spliterator<Book> trySplit() {
        return null;
    }
    @Override
    public long estimateSize() {
        return 0;
    }

    @Override
    public int characteristics() {
        return 0;
    }
}
