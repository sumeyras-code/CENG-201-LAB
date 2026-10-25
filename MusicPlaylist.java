/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        Sümeyra Şanlı
 * Your Student ID:  220446023
 * Your Date:        25.10.2026
 */

public class MusicPlaylist {

    private SongNode head;
    private SongNode tail;
    private SongNode current;

    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;
    }

    // Add a song to the end of the playlist
    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove a song from the playlist
    public void removeSong(String title) {
        SongNode nodeToRemove = head;

        while (nodeToRemove != null && !nodeToRemove.title.equals(title)) {
            nodeToRemove = nodeToRemove.next;
        }

        if (nodeToRemove == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }

        if (nodeToRemove.prev == null) {
            head = nodeToRemove.next;
        } else {
            nodeToRemove.prev.next = nodeToRemove.next;
        }

        if (nodeToRemove.next == null) {
            tail = nodeToRemove.prev;
        } else {
            nodeToRemove.next.prev = nodeToRemove.prev;
        }

        if (current == nodeToRemove) {
            if (nodeToRemove.next != null) {
                current = nodeToRemove.next;
            } else {
                current = nodeToRemove.prev;
            }
        }

        nodeToRemove.prev = null;
        nodeToRemove.next = null;

        System.out.println("Removed: " + title);
    }

    // Move to the next song
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }

    // Move to the previous song
    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }

    // Display the current song
    public void displayCurrentSong() {
        if (current == null) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Current Song: " + current.title);
        }
    }

    // Display all songs
    public void displayPlaylist() {
        SongNode temp = head;

        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
}
