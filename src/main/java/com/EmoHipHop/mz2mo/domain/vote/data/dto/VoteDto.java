package com.EmoHipHop.mz2mo.domain.vote.data.dto;

public record VoteDto(
    String userId,
    String musicId,
    String[] currentVoteEmojiIds
) { }