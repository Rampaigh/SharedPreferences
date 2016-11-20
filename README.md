# Settings.java

**SharedPreferences** just got a whole lot better!

### Usage
```java
Settings settings;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    settings = new SettingsActivity(getApplicationContext());
}
```

### Getting Settings
```java
settings.getBool("myBoolean");
settings.getFloat("myFloat");
settings.getInt("myInteger");
settings.getLong("myLong");
settings.getString("myString");
settings.getStringSet("myStringSet");
```

### Setting Settings
```java
settings.getBool("myBoolean", true);
settings.getFloat("myFloat", 0.7564);
settings.getInt("myInteger", 132);
settings.getLong("myLong", 13234893487);
settings.getString("myString", "This is myString's value");
settings.getStringSet("myStringSet", null);
```
