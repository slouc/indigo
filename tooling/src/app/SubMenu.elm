module App.SubMenu exposing (subMenu)

import App.Msg exposing (Msg)
import App.PageRouting exposing (bumpToNormalSlug)
import Html exposing (..)
import Html.Attributes exposing (href)


type alias MenuItem =
    { label : String
    , url : String
    }


subMenu : Html Msg
subMenu =
    navMenu
        [ MenuItem "Home" "/"
        , MenuItem "Bump To Normal" ("/" ++ bumpToNormalSlug)
        ]


navMenu : List MenuItem -> Html Msg
navMenu items =
    div []
        [ ul [] (List.map navItem items)
        ]


navItem : MenuItem -> Html Msg
navItem item =
    li []
        [ a [ href item.url ]
            [ text item.label ]
        ]