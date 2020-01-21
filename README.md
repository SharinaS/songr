# Songr Demo Project with Albums
This app allows a user to view a collection of albums. When you choose to view the details of each album, the user can then view and add songs into the database.

A basic webapp that has
* a splash page
* a hello route
* a capitalize route
* an Album class
* an albums page
* A details page

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
