# Songr Demo Project with Albums
An interactive app built with REST architecture. It allows a user to view and edit a collection of albums. The details of each album can be viewed and edited, so songs can be added to and removed from the database.

Routes
* a splash page
```$xslt
localhost:8080/
```
* a hello route
```$xslt
localhost:8080/hello
```
* a capitalize route that allows the user to add a word into the url, for it to then be capitalized
```
localhost:8080/capitalize/word-to-be-capitalized
```
* An albums page that shows all the albums in the collection
```
localhost:8080/albums
```
* A details page that shows all the songs associated with each album

## Songr uses:
* Java
* PostgreSQL
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

# Database
## About the Database
A PostGreSQL database is used in Songr. 

The database is called 'albums.' It has a table called 'album.' Once you create the database, it appears like so in PostGreSQL. 
```
 id | artist | image_url | length_in_sec | song_count | title 
----+--------+-----------+---------------+------------+-------
```

### CheatSheet for working with the database from the command line
1. Navigate to the local repo
2. type `psql` to connect to PostGreSQL
3. Connect to the database with `\c albums;`
4. Check the tables within the database with `\dt`
5. See the contents of a table with `select * from album;`
6. Type `q` to get out of seeing table contents
7. Delete a row from a table with `DELETE FROM album WHERE artist='John Smith';`
