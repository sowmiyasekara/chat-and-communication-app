<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.ChatConnect"
        tools:targetApi="31">
        <activity
            android:name=".view.register.Register"
            android:exported="false"
            android:label="@string/title_activity_register"
            android:theme="@style/Theme.ChatConnect" />
        <activity
            android:name=".view.login.Login"
            android:exported="false"
            android:label="@string/title_activity_login"
            android:theme="@style/Theme.ChatConnect" />
        <activity
            android:name=".view.home.Home"
            android:exported="false"
            android:label="@string/title_activity_home"
            android:theme="@style/Theme.ChatConnect" />
        <activity
            android:name=".view.Widgets"
            android:exported="false"
            android:label="@string/title_activity_widgets"
            android:theme="@style/Theme.ChatConnect" />
        <activity
            android:name=".view.AuthenticationOption"
            android:exported="false"
            android:label="@string/title_activity_authentication_option"
            android:theme="@style/Theme.ChatConnect" />
        <activity
            android:name=".nav.Navigation"
            android:exported="false"
            android:label="@string/title_activity_navigation"
            android:theme="@style/Theme.ChatConnect" />
        <activity
            android:name=".NavComposeApp"
            android:exported="false"
            android:label="@string/title_activity_nav_compose_app"
            android:theme="@style/Theme.ChatConnect" />
        <activity
            android:name=".MainActivity"
            android:exported="true"
            android:label="@string/app_name"
            android:theme="@style/Theme.ChatConnect">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
