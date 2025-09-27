# PlaceholderAPI-Expansion
1.19.4 branch of PlaceholderAPI Expansion for MiniPlaceholders

## Supported Platforms

- Paper

## Placeholders

- `<placeholderapi_global:(placeholder)>`
Velocity:
- `<placeholderapi_global:(placeholder):(expiry)>`

This placeholder does not require any player to work.
Its operation would be similar to running the command `/papi parse --null (placeholders)`

- `<placeholderapi_player:(placeholder)>`
Velocity:
- `<placeholderapi_player:(placeholder):(expiry)>`

This placeholder requires an online player to function.
Its operation would be similar to running the `/papi parse me (placeholders)` command

- `<placeholderapi_relational:(placeholder)>`
Velocity:
- `<placeholderapi_relational:(placeholder):(expiry)>`

This placeholder requires two online players to work.
The functioning of this placeholder depends on whether the plugin in which it is used has relational placeholder support

If you want to nest the result of the placeholder inside another placeholder, add the string argument.
For example:
- `<placeholderapi_player:%player_name%:string>`
- `<placeholderapi_player:%player_name%:string:30000>`

## Downloads

[![](https://raw.githubusercontent.com/Prospector/badges/master/modrinth-badge-72h-padded.png)](https://modrinth.com/plugin/miniplaceholders-placeholderapi-expansion)
