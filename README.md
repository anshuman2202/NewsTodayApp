# Project Overview
This is a News Application, where you can read news from various sources at one plce. The News Today app fetches you News from NewsAPI.org for topics like, Science, technology, sports, healths, and many more. It shows you news in brief, and then you can read it by opening the news and it'll direct you to the news source's website.

The news are particularly from India, and language is english. The app requires only use internet connection to fetch the news from the API. 
To make the application I've used piccasso library, which helped in downloading images. The REST client retrofit2 library to is used to invoke API for our app.
The layout contains two Recycler View, one for News categories and another for News.

# API Source 
This app uses NewsAPI (https://newsapi.org/) to get various sources and each source can provide major headlines.

# Dependencies Used
    implementation 'com.squareup.picasso:picasso:2.71828'
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
    
# Design

![app design-8](https://user-images.githubusercontent.com/68992974/124392175-d9038080-dd11-11eb-835b-482fad540b6d.png)

# Working

https://user-images.githubusercontent.com/68992974/124392771-ff76eb00-dd14-11eb-8153-6f3d3576f569.mp4



