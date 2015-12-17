package com.airbnb.di.hive.hooks;

/**
 * TODO: Migrate to HiveOperation from hive-exec once exchange partitions is in
 */
public enum HiveOperation {
    EXPLAIN,
    LOAD,
    EXPORT,
    IMPORT,
    CREATEDATABASE,
    DROPDATABASE,
    SWITCHDATABASE,
    DROPTABLE,
    DESCTABLE,
    DESCFUNCTION,
    MSCK,
    ALTERTABLE_ADDCOLS,
    ALTERTABLE_REPLACECOLS,
    ALTERTABLE_RENAMECOL,
    ALTERTABLE_RENAMEPART,
    ALTERTABLE_RENAME,
    ALTERTABLE_DROPPARTS,
    ALTERTABLE_ADDPARTS,
    ALTERTABLE_TOUCH,
    ALTERTABLE_ARCHIVE,
    ALTERTABLE_UNARCHIVE,
    ALTERTABLE_PROPERTIES,
    ALTERTABLE_SERIALIZER,
    ALTERPARTITION_SERIALIZER,
    ALTERTABLE_SERDEPROPERTIES,
    ALTERPARTITION_SERDEPROPERTIES,
    ALTERTABLE_CLUSTER_SORT,
    ANALYZE_TABLE,
    ALTERTABLE_BUCKETNUM,
    ALTERPARTITION_BUCKETNUM,
    SHOWDATABASES,
    SHOWTABLES,
    SHOWCOLUMNS,
    SHOW_TABLESTATUS,
    SHOW_TBLPROPERTIES,
    SHOW_CREATETABLE,
    SHOWFUNCTIONS,
    SHOWINDEXES,
    SHOWPARTITIONS,
    SHOWLOCKS,
    CREATEFUNCTION,
    DROPFUNCTION,
    CREATEMACRO,
    DROPMACRO,
    CREATEVIEW,
    DROPVIEW,
    CREATEINDEX,
    DROPINDEX,
    ALTERINDEX_REBUILD,
    ALTERVIEW_PROPERTIES,
    DROPVIEW_PROPERTIES,
    LOCKTABLE,
    UNLOCKTABLE,
    CREATEROLE,
    DROPROLE,
    GRANT_PRIVILEGE,
    REVOKE_PRIVILEGE,
    SHOW_GRANT,
    GRANT_ROLE,
    REVOKE_ROLE,
    SHOW_ROLES,
    SHOW_ROLE_GRANT,
    ALTERTABLE_PROTECTMODE,
    ALTERPARTITION_PROTECTMODE,
    ALTERTABLE_FILEFORMAT,
    ALTERPARTITION_FILEFORMAT,
    ALTERTABLE_LOCATION,
    ALTERPARTITION_LOCATION,
    CREATETABLE,
    TRUNCATETABLE,
    CREATETABLE_AS_SELECT,
    QUERY,
    ALTERINDEX_PROPS,
    ALTERDATABASE,
    DESCDATABASE,
    ALTERTABLE_MERGEFILES,
    ALTERPARTITION_MERGEFILES,
    ALTERTABLE_SKEWED,
    ALTERTBLPART_SKEWED_LOCATION,
    ALTERVIEW_RENAME;
}
