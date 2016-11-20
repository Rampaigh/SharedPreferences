# Settings.java

SharedPreferences just got a whole lot better!

#### Usage
```java
Settings settings;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    settings = new SettingsActivity(getApplicationContext());
}
```

#### Getting Settings
```java
settings.getBool("myBoolean");
settings.getFloat("myFloat");
settings.getInt("myInteger");
settings.getLong("myLong");
settings.getString("myString");
settings.getStringSet("myStringSet");
```

#### Setting Settings
```java
settings.setBool("myBoolean", true);
settings.setFloat("myFloat", 0.7564);
settings.setInt("myInteger", 132);
settings.setLong("myLong", 13234893487);
settings.setString("myString", "This is myString's value");
settings.setStringSet("myStringSet", null);
```
