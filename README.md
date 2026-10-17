# AbhiOS Launcher

An iPhone-inspired Android launcher prototype built with Kotlin and Jetpack Compose.

## Build without installing Android Studio locally

1. Create a GitHub repository and upload the contents of this project.
2. Keep `.github/workflows/build.yml` in that exact location.
3. Push/commit the files to the `main` branch.
4. Open the repository's **Actions** tab and wait for **Build AbhiOS Launcher APK** to finish.
5. Open the successful workflow run and download the `AbhiOS-Launcher-Debug-APK` artifact.
6. Extract the downloaded artifact ZIP to get `app-debug.apk`.

## Install on an OPPO phone

Transfer `app-debug.apk` to the phone and install it. If Android blocks the installation, allow installation from the app used to open the APK. To try the launcher, open Settings and choose AbhiOS as the default Home app. You can switch back to the OPPO/System Launcher at any time.

## Notes

- This project has not been compiled in this environment. The GitHub Actions run is the build verification step.
- It provides an Android launcher prototype, not a replacement for iOS or Android's protected system UI.
- Some Android versions may restrict which installed apps can be discovered.
