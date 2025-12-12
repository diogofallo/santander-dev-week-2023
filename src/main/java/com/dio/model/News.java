package com.dio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;

@Table(name="new")
@Entity(name = "tb_news")
public class News extends BaseItem{
}
