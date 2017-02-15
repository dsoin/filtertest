# filtertest
- Change def tomcatHome in build.gradle to point to your Tomcat's webapps
- gradle deployWar
- test it: http://localhost:8080/filtertest/?name=%22%20onmouseover=%22alert(%27hey%27)
