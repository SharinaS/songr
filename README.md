# Songr Demo Project with Albums
A basic webapp that has
* a splash page
* a hello route
* a capitalize route
* an Album class
* an albums page

## Songr uses:
* Java
* PostGreSQL
* HTML
* Bootstrap
* CSS

## Contributor
Sharina Stubbs

## Run this application
1. Git clone this repo into your local system
2. Run `.gradlew bootrun`
3. Go to localhost:8080 to see the splash page
4. Go to localhost:8080/capitalize/your-word-or-sentence-here to change your word or sentence to uppercase.
5. Go to localhost:8080/albums to see a collection of musical albums. Add in your favorite albums.

## Database is called 'albums.' It has a table called 'album.' It appears like so in PostGreSQL. 
```
 id | artist | image_url | length_in_sec | song_count | title 
----+--------+-----------+---------------+------------+-------
```


