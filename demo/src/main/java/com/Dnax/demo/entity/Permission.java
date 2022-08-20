package com.Dnax.demo.entity;

import com.Dnax.demo.enumtype.PermissionType;
import lombok.Getter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="permission")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")  //用id来连接两个表  加在many端，有利于关系的维持
    @JsonBackReference
    @Getter @Setter private User user;

    @OneToOne
    @JoinColumn(name = "department_id")
    @Getter @Setter private Department department;

    @Enumerated(value = EnumType.ORDINAL)//用数值的方式来替代枚举的类型名字
    @Getter @Setter private PermissionType permissionType;//具体到底是什么类型的权限

}
