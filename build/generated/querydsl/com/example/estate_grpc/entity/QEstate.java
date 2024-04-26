package com.example.estate_grpc.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEstate is a Querydsl query type for Estate
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEstate extends EntityPathBase<Estate> {

    private static final long serialVersionUID = -738972375L;

    public static final QEstate estate = new QEstate("estate");

    public final NumberPath<Integer> buildingFloor = createNumber("buildingFloor", Integer.class);

    public final StringPath direction = createString("direction");

    public final StringPath estateType = createString("estateType");

    public final StringPath hashtag = createString("hashtag");

    public final StringPath id = createString("id");

    public final StringPath location = createString("location");

    public final NumberPath<Double> m2 = createNumber("m2", Double.class);

    public final NumberPath<Integer> room = createNumber("room", Integer.class);

    public final NumberPath<Integer> toilet = createNumber("toilet", Integer.class);

    public final NumberPath<Integer> totalFloor = createNumber("totalFloor", Integer.class);

    public QEstate(String variable) {
        super(Estate.class, forVariable(variable));
    }

    public QEstate(Path<? extends Estate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstate(PathMetadata metadata) {
        super(Estate.class, metadata);
    }

}

