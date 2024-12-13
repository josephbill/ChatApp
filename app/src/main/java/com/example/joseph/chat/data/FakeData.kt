package com.example.joseph.chat.data

import com.example.joseph.chat.R
import com.example.joseph.chat.conversation.ConversationUiState
import com.example.joseph.chat.conversation.Message
import com.example.joseph.chat.data.EMOJIS.EMOJI_CLOUDS
import com.example.joseph.chat.data.EMOJIS.EMOJI_FLAMINGO
import com.example.joseph.chat.data.EMOJIS.EMOJI_MELTING
import com.example.joseph.chat.data.EMOJIS.EMOJI_PINK_HEART
import com.example.joseph.chat.data.EMOJIS.EMOJI_POINTS
import com.example.joseph.chat.profile.ProfileScreenState

private val initialMessages = listOf(
    Message(
        "me",
        "Check it out!",
        "8:07 AM"
    ),
    Message(
        "me",
        "Thank you!$EMOJI_PINK_HEART",
        "8:06 AM",
        R.drawable.sticker
    ),
    Message(
        "Joseph",
        "You can use all the same stuff",
        "8:05 AM"
    ),
    Message(
        "Joseph",
        "@ann Take a look at the compose APIs",
        "8:05 AM"
    ),
    Message(
        "Kamau",
        "This project is awesome! ",
        "8:04 AM"
    ),
    Message(
        "me",
        "What’s the recommended way to load async data ?",
        "8:03 AM"
    )
)

val exampleUiState = ConversationUiState(
    initialMessages = initialMessages,
    channelName = "#kotlin",
    channelMembers = 6
)

/**
 * Example colleague profile
 */
val colleagueProfile = ProfileScreenState(
    userId = "12345",
    photo = R.drawable.ali,
    name = "Joseph",
    status = "Away",
    displayName = "joseph",
    position = "Senior Android Dev at mCarFix",
    twitter = "twitter.com/dekreebill",
    timeZone = "12:25 AM local time (Eastern Daylight Time)",
    commonChannels = "2"
)

/**
 * Example "me" profile.
 */
val meProfile = ProfileScreenState(
    userId = "me",
    photo = R.drawable.someone_else,
    name = "Ann",
    status = "Online",
    displayName = "ann",
    position = "Tech Product Lead",
    twitter = "twitter.com/ann",
    timeZone = "In your timezone",
    commonChannels = null
)

object EMOJIS {
    // EMOJI 15
    const val EMOJI_PINK_HEART = "\uD83E\uDE77"

    // EMOJI 14 🫠
    const val EMOJI_MELTING = "\uD83E\uDEE0"

    // ANDROID 13.1 😶‍🌫️
    const val EMOJI_CLOUDS = "\uD83D\uDE36\u200D\uD83C\uDF2B️"

    // ANDROID 12.0 🦩
    const val EMOJI_FLAMINGO = "\uD83E\uDDA9"

    // ANDROID 12.0  👉
    const val EMOJI_POINTS = " \uD83D\uDC49"
}
