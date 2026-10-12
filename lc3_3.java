// -------------------activity_main.xml-------------------

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    android:padding="20dp">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Activity 1"
        android:textSize="30sp"
        android:textStyle="bold" />

    <Button
        android:id="@+id/btnNext1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Go to Activity 2" />

</LinearLayout>
```
// -------------------MainActivity.java-------------------

```java
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnNext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext1 = findViewById(R.id.btnNext1);

        btnNext1.setOnClickListener(v -> {
            Intent intent = new Intent(
                MainActivity.this,
                SecondActivity.class
            );

            startActivity(intent);
        });
    }
}
```
// -------------------activity_second.xml-------------------

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    android:padding="20dp">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Activity 2"
        android:textSize="30sp"
        android:textStyle="bold" />

    <Button
        android:id="@+id/btnNext2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Go to Activity 3" />

</LinearLayout>
```
// -------------------SecondActivity.java-------------------

```java
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Button btnNext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnNext2 = findViewById(R.id.btnNext2);

        btnNext2.setOnClickListener(v -> {
            Intent intent = new Intent(
                SecondActivity.this,
                ThirdActivity.class
            );

            startActivity(intent);
        });
    }
}
```
// -------------------activity_third.xml-------------------

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    android:padding="20dp">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Activity 3"
        android:textSize="30sp"
        android:textStyle="bold" />

    <Button
        android:id="@+id/btnFinish"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Go back to Activity 1" />

</LinearLayout>
```
// -------------------ThirdActivity.java-------------------

```java
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnFinish = findViewById(R.id.btnFinish);

        btnFinish.setOnClickListener(v -> {
            Intent intent = new Intent(
                ThirdActivity.this,
                MainActivity.class
            );

            startActivity(intent);
        });
    }
}
```
// -------------------AndroidManifest.xml-------------------

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest
    xmlns:android="http://schemas.android.com/apk/res/android">

    <application
        android:allowBackup="true"
        android:label="My Application"
        android:supportsRtl="true"
        android:theme="@style/Theme.MyApplication">

        <activity
            android:name=".ThirdActivity"
            android:exported="false" />

        <activity
            android:name=".SecondActivity"
            android:exported="false" />

        <activity
            android:name=".MainActivity"
            android:exported="true">

            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>

        </activity>

    </application>
</manifest>
```
