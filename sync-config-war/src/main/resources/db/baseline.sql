CREATE TABLE IF NOT EXISTS Sync_Work_Config_table (
    id                      BIGINT AUTO_INCREMENT PRIMARY KEY,
    name                    VARCHAR(128) NOT NULL,
    description             VARCHAR(255),
    createdDate             TIMESTAMP,
    encryptionKey           VARCHAR(255),
    srcRepoPluginName       VARCHAR(255),
    syncToRepoCron          VARCHAR(255),
    syncToRepoEnabled       BOOLEAN      NOT NULL,
    syncToServerEnabled     BOOLEAN      NOT NULL,
    syncToZanataCron        VARCHAR(255),
    syncToZanataOption      VARCHAR(255),
    transServerConfigJson   CLOB,
    srcRepoPluginConfigJson CLOB
);

CREATE TABLE IF NOT EXISTS Job_Status_table (
    id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    workId        BIGINT      NOT NULL,
    jobType       VARCHAR(20) NOT NULL,
    jobStatusType VARCHAR(20) NOT NULL,
    startTime     TIMESTAMP,
    endTime       TIMESTAMP,
    nextStartTime TIMESTAMP,
    FOREIGN KEY (workId) REFERENCES Sync_Work_Config_table (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS System_Settings_table (
    id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    version BIGINT      NOT NULL,
    key     VARCHAR(50) NOT NULL UNIQUE,
    value   VARCHAR(50) NOT NULL
);
