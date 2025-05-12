# Project: Text Adventure

Authors: Emily Lackershrie & Finn Rowles

## Resources

+ Java 17
+ Visual Studio Code
+ Instructions provided from Professor Osera of Grinnell College, accessed through his website: 
  https://osera.cs.grinnell.edu/ttap/data-structures-labs/text-adventure.html
+ git & github
+ the math Java library for absolute value calculations.
+ the string and scanner libraries for parsing and working with strings.
+ Colton Benson for playtesting.
+ Previous Homework Grin Compression for adapted checkstyle, pom, surpressions (not used though)

## Git Log

Game hints : !!
Look at the whiteboard to get the code to the first room. The code is 4972.

In this room, there is an icePick. Use this to boost your damage , and also, there is armor if you attack the computer.

In the commons, there is a key under the homework. If you "use" the homework you also get a stat buff. 
You can pick up this key and use it on the lab door. The code to the room (which you get by inspecting the door, or the sticky note) is 8888 (the amount of bits in a character four times in most cases). Use both to unlock the room.

In the lab, there is a tree. Pick up and use the dagger to boost your damage to destroy the tree, which gives you gold armor.
You're now probably strong enough to beat Osera in a fight. When you kill him, he will transfer the Golden key, which you can use to escape in hallway5 at the last door. There are a few more secrets but overall unecessary.


# LOG: 
commit edbe5bf53ae7e4d674a3877c84da45f304228fdf (HEAD -> main)
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 23:26:38 2025 -0500

    more random stuff

commit 5f3574706dd2a3e46edfdaffc7ea9e1f439fba47 (origin/main, origin/HEAD)
Merge: fa5943c aae38f9
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 22:13:48 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit fa5943c227f751c2225f8784378abd837681f471
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 22:13:38 2025 -0500

    Some more fixes

commit aae38f982e7dc41bdf1372b91518515b0ae964dd
Merge: 6d70dbd ac71dd0
Author: Emily <lackersh@grinnell.edu>
Date:   Sun May 11 21:48:49 2025 -0400

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit 6d70dbd67746c0fd171ba2a1589e9c03c0d6b0b3
Author: Emily <lackersh@grinnell.edu>
Date:   Sun May 11 21:48:36 2025 -0400

    pom, suppression and checkstyle files

commit ac71dd09712c29695c358fa1134eb079fb019a51
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 20:03:30 2025 -0500

    Game hints in README and obstacle fixes

commit e786e262da82d51918481cacf2a584c96ae44022
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 19:49:05 2025 -0500

    more stuff implemented

commit 80a213af7d29ea38d09d6397d8cd20aa95dd37de
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 14:47:33 2025 -0500

    healing/combat bug fixes, more item methods

commit bbe43f009c4467122ebd80841f49c03d9f967723
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 14:31:30 2025 -0500

    some bug fixes and playtesting

commit f68ef5876f353176108ede40331b214ac6b5c00d
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 14:06:28 2025 -0500

    Updating obstacles to be breakable and more general "look" conditions

commit c8cf53100637ad470ec0b6b14ce8c0496993b914
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 13:46:56 2025 -0500

    New items and updates

commit cf63386b0128cbcb61ba805373de214e3b40266f
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 12:57:34 2025 -0500

    modified more files to make it more complex

commit 55937e5b1cf67a3d0ffe31f81ae6c1c2ee908498
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sun May 11 11:31:16 2025 -0500

    some bug fixing, combat testing, and design

commit 32715a8bbf23ecbec0c709bcf932bd14d1db3d50
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sat May 10 23:42:09 2025 -0500

    some debugging and testing

commit ff2f1e0cfb5fd36dff5d1eb1c8aed64879437bba
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sat May 10 23:07:31 2025 -0500

    Some testing. Lots of stuff implemented

commit 91124758934aa7034146f544618ba91ec1235772
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sat May 10 22:32:28 2025 -0500

    Did a ton of stuff. Added a combat, sub-type items, and a parser (not in use currently)

commit 0a6b69fbce5c1534e3b97a87ad6fadb7f48458be
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sat May 10 16:42:07 2025 -0500

    Modified items and fixed some bugs.

commit a04724286d84e86f9569d0c81f3fbba55d7c9b8d
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sat May 10 15:26:36 2025 -0500

    More fields and some designing of items/NPC

commit 6a7aed0a68f4bbc52e92974f0f9f2f962f8bbb03
Author: Emily <lackersh@grinnell.edu>
Date:   Fri May 9 15:27:12 2025 -0500

    text adventure

commit 40f1c5c53b1266fa12ec261cc4abfd75ef01c6eb
Author: Emily <lackersh@grinnell.edu>
Date:   Fri May 9 14:31:11 2025 -0500

    java doc again

commit 14d80cc314b5a58bb2354a194dce19266e149948
Author: Emily <lackersh@grinnell.edu>
Date:   Fri May 9 14:11:12 2025 -0500

    JAVA DOC

commit 78ae0ad454cbe1c5544cc34e4968c9d70beb44e4
Author: Emily <lackersh@grinnell.edu>
Date:   Fri May 9 12:46:32 2025 -0500

    named rooms

commit e8cae9d19a2d14cd445a8e0eb5451f9fa0ac498b
Merge: ae82b62 228dd41
Author: finn-rules <finn.rowles@gmail.com>
Date:   Wed May 7 18:46:38 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit ae82b627d4957d9c8004e0a20d72ddfc879472e5
Author: finn-rules <finn.rowles@gmail.com>
Date:   Wed May 7 18:45:54 2025 -0500

    update

commit 228dd4156adde57207b2e8d3e373e38467d8e7f5
Author: Emily <lackersh@grinnell.edu>
Date:   Wed May 7 15:18:00 2025 -0500

    setAdjacentRooms

commit 435eadd7c05059df18352b10ccc86b0c52078089
Merge: 6c7c6c7 56d95bc
Author: Emily <lackersh@grinnell.edu>
Date:   Wed May 7 15:17:02 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit 6c7c6c75573c2b2a62e39628a3a78ebb73ed146f
Author: Emily <lackersh@grinnell.edu>
Date:   Wed May 7 15:15:32 2025 -0500

    user can now go through rooms!

commit 56d95bc4a01bb6d7bda16392076a7ec0b5e23b6d
Merge: 83d9215 4dd536c
Author: finn-rules <finn.rowles@gmail.com>
Date:   Wed May 7 14:38:14 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit 83d9215543d9d6e8efdb3d1893155380560fb196
Author: finn-rules <finn.rowles@gmail.com>
Date:   Wed May 7 14:35:34 2025 -0500

    my code might be gone

commit b9e5cdbfa1128d294b122b7b0374d14db35d5866
Merge: 65a124f a917ed3
Author: finn-rules <finn.rowles@gmail.com>
Date:   Wed May 7 14:35:26 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit 4dd536c42eadd638e31eccc335f0971bdec5aa11
Author: Emily <lackersh@grinnell.edu>
Date:   Wed May 7 14:33:42 2025 -0500

    updated so go hopefully works and all of the rooms

commit 65a124f4c4fbdfd0bb2435aa85630baccd854858
Author: finn-rules <finn.rowles@gmail.com>
Date:   Wed May 7 12:37:46 2025 -0500

    Tested stuff

commit a917ed371efce7440beb40af9a70378ac73938d0
Author: Emily <lackersh@grinnell.edu>
Date:   Wed May 7 10:52:31 2025 -0500

    got textadventure ready

commit a4163a453ec0107db5fc5aef157211ee18b30acc
Author: Emily <lackersh@grinnell.edu>
Date:   Wed May 7 10:43:57 2025 -0500

    got rid of errors in obstacle

commit 6a98eb58ed7a96b107f40816d94d218248f81ab4
Merge: 10202d0 b9e0bfe
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 21:43:09 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit 10202d00da6bc9b26b36ad01f95bb7c457468489
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 21:43:06 2025 -0500

    random obstacles

commit b9e0bfeff59065094ba2bd6c8e7fb7fc06ac2a40
Author: Emily <lackersh@grinnell.edu>
Date:   Tue May 6 21:39:53 2025 -0500

    spelling whoops

commit aab838849dae2ee69fff5427d7d10d8a0159e0ea
Author: Emily <lackersh@grinnell.edu>
Date:   Tue May 6 21:38:59 2025 -0500

    lots, made each of the rooms their own file and created them all in text adventure

commit 547caa6b98dd9d9fe6021ccef61d2bd0416ed970
Merge: 27d3f0e 10fab2f
Author: Emily <lackersh@grinnell.edu>
Date:   Tue May 6 20:38:40 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit 27d3f0e85cd657c19c0f8d063916c9a9d80c6bb2
Author: Emily <lackersh@grinnell.edu>
Date:   Tue May 6 20:38:38 2025 -0500

    connection

commit 10fab2f9d5cbeab08e4085d7ed0bfeeb3790818e
Merge: ff0ae3f a2654de
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 20:38:22 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit ff0ae3ff16b32af84eb2d124db938aa6913c5370
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 20:38:20 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit a2654de8a86cad4a50d639a279dfbc00989b7a2d
Merge: 94927fe a0cf07e
Author: Emily <lackersh@grinnell.edu>
Date:   Tue May 6 20:37:42 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit 94927fed7303d2316209819481fed3e21db4c84f
Author: Emily <lackersh@grinnell.edu>
Date:   Tue May 6 20:37:37 2025 -0500

    player

commit a0cf07e69aa9ac9065de123d44b64580fed7e6b0
Merge: c4fc745 7604265
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 20:36:22 2025 -0500

    Merge branch 'main' of https://github.com/finn-rules/text-adventure

commit 7604265ccd4732970a7bfb0e82fdd86c7b5060dc
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 20:33:54 2025 -0500

    Create Obstacle.java

commit 2e12b732f38bd6e18d0f8a6fd4609a7d124c6395
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 20:33:26 2025 -0500

    Create NPC.java

commit d16252334d32ec3ed5c60088156e8f0dc5a865aa
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 20:32:54 2025 -0500

    Update Player.java

commit c4fc7455aac1e9a2fbb12e50e008f2f2639fa1b2
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 20:30:57 2025 -0500

    made a bunch of classes

commit 0ad209ff1b8f98224f5f08c9e825f1b141d24009
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 20:25:29 2025 -0500

    player, npc, obstacle (unfinished)

commit a072978f844dac9288824029c7b4203d3e8653da
Author: Emily <lackersh@grinnell.edu>
Date:   Tue May 6 20:17:25 2025 -0500

    created the rooms class with getter methods as well as classes extending for the rooms and hallway segments

commit 9dbd86aa00eb90933adc916175d9ea766d7ec839
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 19:57:00 2025 -0500

    Created room and its fields

commit f7a6c0818d4cfd19186cae6007fcfeca5a275554
Author: Emily <lackersh@grinnell.edu>
Date:   Tue May 6 19:51:22 2025 -0500

    updated player

commit ca691ce4896f9036998c99b62640f6d4a867cfaf
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 19:40:58 2025 -0500

    updated room

commit bebaa842618006343b1db5d89f05612cfc276d95
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 19:40:22 2025 -0500

    Room.java created

commit d896d8a0a13fc4d83ac7de3d131af26e1c72080e
Author: Emily <lackersh@grinnell.edu>
Date:   Tue May 6 19:39:26 2025 -0500

    class player

commit f1db605909f60f1be013b1093548a4b8ccee739a
Author: Emily <lackersh@grinnell.edu>
Date:   Tue May 6 19:32:19 2025 -0500

    readme

commit 6da62f8b4c25cfb437618e397a02ba24dbfe61c2
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 19:26:08 2025 -0500

    more ideas

commit e6baf24dcee40fc8e888a2c6b40b406f15b9fa30
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 15:10:29 2025 -0500

    touched up text adventure

commit 34d7cf81b227a9b99fb195013bd6f17db658843a
Author: finn-rules <finn.rowles@gmail.com>
Date:   Tue May 6 14:52:13 2025 -0500

    Create TextAdventure.java

commit 82b68593c83c75d641435ab2e50f89da5d4a8ea5
Author: finn-rules <finn.rowles@gmail.com>
Date:   Sat May 3 14:27:04 2025 -0500

    Initial commit