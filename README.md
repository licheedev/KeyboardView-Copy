# KeyboardView-Copy
copy了AOSP KeyboardView源码，清除爆红的代码，然后小了一下，让其可以在布局编辑器里面正常预览

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://dl.bintray.com/licheedev/maven' }
  }
}

implementation 'com.licheedev:keyboardview-copy:1.0.1'
```