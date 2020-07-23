package com.tts.TTSTwitter.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.TTSTwitter.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
	public Tag findByPhrase(String phrase);
}
