/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:        Sümeyra Şanlı
 * Your Student ID:  220446023
 * Your Date:        25.10.2026
 */

public class SongNode {

    String title;

    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}
