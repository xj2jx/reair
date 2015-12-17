package com.airbnb.di.hive.replication;

public enum ReplicationOperation {
    COPY_UNPARTITIONED_TABLE,
    COPY_PARTITIONED_TABLE,
    COPY_PARTITION,
    COPY_PARTITIONS,
    DROP_TABLE,
    DROP_PARTITION,
    RENAME_TABLE,
    RENAME_PARTITION,
}
