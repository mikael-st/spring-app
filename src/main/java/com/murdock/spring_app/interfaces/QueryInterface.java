package com.murdock.spring_app.interfaces;

import java.util.List;

public interface QueryInterface<T> {
  T create();
  T find();
  List<T> list();
  T edit();
  T delete();
}
