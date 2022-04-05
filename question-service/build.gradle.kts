plugins{
    java
}

repositories {
    mavenCentral()
}

dependencies {
    //通过bom 文件来管理版本
    testImplementation(platform("org.junit:junit-bom:5.8.2"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    runtimeOnly("org.junit.jupiter:junit-jupiter-engine")
}


tasks{
    test {
        useJUnitPlatform()
    }
}