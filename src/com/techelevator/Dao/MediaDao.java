package com.techelevator.Dao;

import com.techelevator.model.Media;

import java.util.List;

public interface MediaDao {
    List<Media> getAllMedia();

    Media getMediaByTitle(String title);

    Media create(Media media);

    Media update(Media media, String title);

    Media delete(String title);
}
