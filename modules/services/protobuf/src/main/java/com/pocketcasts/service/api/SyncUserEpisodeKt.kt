// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

package com.pocketcasts.service.api

@kotlin.jvm.JvmName("-initializesyncUserEpisode")
public inline fun syncUserEpisode(block: com.pocketcasts.service.api.SyncUserEpisodeKt.Dsl.() -> kotlin.Unit): com.pocketcasts.service.api.SyncUserEpisode =
    com.pocketcasts.service.api.SyncUserEpisodeKt.Dsl._create(com.pocketcasts.service.api.SyncUserEpisode.newBuilder()).apply { block() }._build()

/**
 * Protobuf type `api.SyncUserEpisode`
 */
public object SyncUserEpisodeKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.pocketcasts.service.api.SyncUserEpisode.Builder,
    ) {
        public companion object {
            @kotlin.jvm.JvmSynthetic
            @kotlin.PublishedApi
            internal fun _create(builder: com.pocketcasts.service.api.SyncUserEpisode.Builder): Dsl = Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): com.pocketcasts.service.api.SyncUserEpisode = _builder.build()

        /**
         * `string uuid = 1;`
         */
        public var uuid: kotlin.String
            @JvmName("getUuid")
            get() = _builder.getUuid()

            @JvmName("setUuid")
            set(value) {
                _builder.setUuid(value)
            }

        /**
         * `string uuid = 1;`
         */
        public fun clearUuid() {
            _builder.clearUuid()
        }

        /**
         * `string podcast_uuid = 2;`
         */
        public var podcastUuid: kotlin.String
            @JvmName("getPodcastUuid")
            get() = _builder.getPodcastUuid()

            @JvmName("setPodcastUuid")
            set(value) {
                _builder.setPodcastUuid(value)
            }

        /**
         * `string podcast_uuid = 2;`
         */
        public fun clearPodcastUuid() {
            _builder.clearPodcastUuid()
        }

        /**
         * `.google.protobuf.BoolValue is_deleted = 3;`
         */
        public var isDeleted: com.google.protobuf.BoolValue
            @JvmName("getIsDeleted")
            get() = _builder.getIsDeleted()

            @JvmName("setIsDeleted")
            set(value) {
                _builder.setIsDeleted(value)
            }

        /**
         * `.google.protobuf.BoolValue is_deleted = 3;`
         */
        public fun clearIsDeleted() {
            _builder.clearIsDeleted()
        }

        /**
         * `.google.protobuf.BoolValue is_deleted = 3;`
         * @return Whether the isDeleted field is set.
         */
        public fun hasIsDeleted(): kotlin.Boolean {
            return _builder.hasIsDeleted()
        }

        /**
         * `.google.protobuf.Int64Value is_deleted_modified = 4;`
         */
        public var isDeletedModified: com.google.protobuf.Int64Value
            @JvmName("getIsDeletedModified")
            get() = _builder.getIsDeletedModified()

            @JvmName("setIsDeletedModified")
            set(value) {
                _builder.setIsDeletedModified(value)
            }

        /**
         * `.google.protobuf.Int64Value is_deleted_modified = 4;`
         */
        public fun clearIsDeletedModified() {
            _builder.clearIsDeletedModified()
        }

        /**
         * `.google.protobuf.Int64Value is_deleted_modified = 4;`
         * @return Whether the isDeletedModified field is set.
         */
        public fun hasIsDeletedModified(): kotlin.Boolean {
            return _builder.hasIsDeletedModified()
        }

        /**
         * `.google.protobuf.Int64Value duration = 5;`
         */
        public var duration: com.google.protobuf.Int64Value
            @JvmName("getDuration")
            get() = _builder.getDuration()

            @JvmName("setDuration")
            set(value) {
                _builder.setDuration(value)
            }

        /**
         * `.google.protobuf.Int64Value duration = 5;`
         */
        public fun clearDuration() {
            _builder.clearDuration()
        }

        /**
         * `.google.protobuf.Int64Value duration = 5;`
         * @return Whether the duration field is set.
         */
        public fun hasDuration(): kotlin.Boolean {
            return _builder.hasDuration()
        }

        /**
         * `.google.protobuf.Int64Value duration_modified = 6;`
         */
        public var durationModified: com.google.protobuf.Int64Value
            @JvmName("getDurationModified")
            get() = _builder.getDurationModified()

            @JvmName("setDurationModified")
            set(value) {
                _builder.setDurationModified(value)
            }

        /**
         * `.google.protobuf.Int64Value duration_modified = 6;`
         */
        public fun clearDurationModified() {
            _builder.clearDurationModified()
        }

        /**
         * `.google.protobuf.Int64Value duration_modified = 6;`
         * @return Whether the durationModified field is set.
         */
        public fun hasDurationModified(): kotlin.Boolean {
            return _builder.hasDurationModified()
        }

        /**
         * `.google.protobuf.Int32Value playing_status = 7;`
         */
        public var playingStatus: com.google.protobuf.Int32Value
            @JvmName("getPlayingStatus")
            get() = _builder.getPlayingStatus()

            @JvmName("setPlayingStatus")
            set(value) {
                _builder.setPlayingStatus(value)
            }

        /**
         * `.google.protobuf.Int32Value playing_status = 7;`
         */
        public fun clearPlayingStatus() {
            _builder.clearPlayingStatus()
        }

        /**
         * `.google.protobuf.Int32Value playing_status = 7;`
         * @return Whether the playingStatus field is set.
         */
        public fun hasPlayingStatus(): kotlin.Boolean {
            return _builder.hasPlayingStatus()
        }

        /**
         * `.google.protobuf.Int64Value playing_status_modified = 8;`
         */
        public var playingStatusModified: com.google.protobuf.Int64Value
            @JvmName("getPlayingStatusModified")
            get() = _builder.getPlayingStatusModified()

            @JvmName("setPlayingStatusModified")
            set(value) {
                _builder.setPlayingStatusModified(value)
            }

        /**
         * `.google.protobuf.Int64Value playing_status_modified = 8;`
         */
        public fun clearPlayingStatusModified() {
            _builder.clearPlayingStatusModified()
        }

        /**
         * `.google.protobuf.Int64Value playing_status_modified = 8;`
         * @return Whether the playingStatusModified field is set.
         */
        public fun hasPlayingStatusModified(): kotlin.Boolean {
            return _builder.hasPlayingStatusModified()
        }

        /**
         * `.google.protobuf.Int64Value played_up_to = 9;`
         */
        public var playedUpTo: com.google.protobuf.Int64Value
            @JvmName("getPlayedUpTo")
            get() = _builder.getPlayedUpTo()

            @JvmName("setPlayedUpTo")
            set(value) {
                _builder.setPlayedUpTo(value)
            }

        /**
         * `.google.protobuf.Int64Value played_up_to = 9;`
         */
        public fun clearPlayedUpTo() {
            _builder.clearPlayedUpTo()
        }

        /**
         * `.google.protobuf.Int64Value played_up_to = 9;`
         * @return Whether the playedUpTo field is set.
         */
        public fun hasPlayedUpTo(): kotlin.Boolean {
            return _builder.hasPlayedUpTo()
        }

        /**
         * `.google.protobuf.Int64Value played_up_to_modified = 10;`
         */
        public var playedUpToModified: com.google.protobuf.Int64Value
            @JvmName("getPlayedUpToModified")
            get() = _builder.getPlayedUpToModified()

            @JvmName("setPlayedUpToModified")
            set(value) {
                _builder.setPlayedUpToModified(value)
            }

        /**
         * `.google.protobuf.Int64Value played_up_to_modified = 10;`
         */
        public fun clearPlayedUpToModified() {
            _builder.clearPlayedUpToModified()
        }

        /**
         * `.google.protobuf.Int64Value played_up_to_modified = 10;`
         * @return Whether the playedUpToModified field is set.
         */
        public fun hasPlayedUpToModified(): kotlin.Boolean {
            return _builder.hasPlayedUpToModified()
        }

        /**
         * `.google.protobuf.BoolValue starred = 11;`
         */
        public var starred: com.google.protobuf.BoolValue
            @JvmName("getStarred")
            get() = _builder.getStarred()

            @JvmName("setStarred")
            set(value) {
                _builder.setStarred(value)
            }

        /**
         * `.google.protobuf.BoolValue starred = 11;`
         */
        public fun clearStarred() {
            _builder.clearStarred()
        }

        /**
         * `.google.protobuf.BoolValue starred = 11;`
         * @return Whether the starred field is set.
         */
        public fun hasStarred(): kotlin.Boolean {
            return _builder.hasStarred()
        }

        /**
         * `.google.protobuf.Int64Value starred_modified = 12;`
         */
        public var starredModified: com.google.protobuf.Int64Value
            @JvmName("getStarredModified")
            get() = _builder.getStarredModified()

            @JvmName("setStarredModified")
            set(value) {
                _builder.setStarredModified(value)
            }

        /**
         * `.google.protobuf.Int64Value starred_modified = 12;`
         */
        public fun clearStarredModified() {
            _builder.clearStarredModified()
        }

        /**
         * `.google.protobuf.Int64Value starred_modified = 12;`
         * @return Whether the starredModified field is set.
         */
        public fun hasStarredModified(): kotlin.Boolean {
            return _builder.hasStarredModified()
        }
    }
}
public inline fun com.pocketcasts.service.api.SyncUserEpisode.copy(block: `com.pocketcasts.service.api`.SyncUserEpisodeKt.Dsl.() -> kotlin.Unit): com.pocketcasts.service.api.SyncUserEpisode =
    `com.pocketcasts.service.api`.SyncUserEpisodeKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.pocketcasts.service.api.SyncUserEpisodeOrBuilder.isDeletedOrNull: com.google.protobuf.BoolValue?
    get() = if (hasIsDeleted()) getIsDeleted() else null

public val com.pocketcasts.service.api.SyncUserEpisodeOrBuilder.isDeletedModifiedOrNull: com.google.protobuf.Int64Value?
    get() = if (hasIsDeletedModified()) getIsDeletedModified() else null

public val com.pocketcasts.service.api.SyncUserEpisodeOrBuilder.durationOrNull: com.google.protobuf.Int64Value?
    get() = if (hasDuration()) getDuration() else null

public val com.pocketcasts.service.api.SyncUserEpisodeOrBuilder.durationModifiedOrNull: com.google.protobuf.Int64Value?
    get() = if (hasDurationModified()) getDurationModified() else null

public val com.pocketcasts.service.api.SyncUserEpisodeOrBuilder.playingStatusOrNull: com.google.protobuf.Int32Value?
    get() = if (hasPlayingStatus()) getPlayingStatus() else null

public val com.pocketcasts.service.api.SyncUserEpisodeOrBuilder.playingStatusModifiedOrNull: com.google.protobuf.Int64Value?
    get() = if (hasPlayingStatusModified()) getPlayingStatusModified() else null

public val com.pocketcasts.service.api.SyncUserEpisodeOrBuilder.playedUpToOrNull: com.google.protobuf.Int64Value?
    get() = if (hasPlayedUpTo()) getPlayedUpTo() else null

public val com.pocketcasts.service.api.SyncUserEpisodeOrBuilder.playedUpToModifiedOrNull: com.google.protobuf.Int64Value?
    get() = if (hasPlayedUpToModified()) getPlayedUpToModified() else null

public val com.pocketcasts.service.api.SyncUserEpisodeOrBuilder.starredOrNull: com.google.protobuf.BoolValue?
    get() = if (hasStarred()) getStarred() else null

public val com.pocketcasts.service.api.SyncUserEpisodeOrBuilder.starredModifiedOrNull: com.google.protobuf.Int64Value?
    get() = if (hasStarredModified()) getStarredModified() else null
