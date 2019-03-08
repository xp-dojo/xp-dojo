
lazy val site = (project in file("site"))
  .enablePlugins(MicrositesPlugin)
  .settings(siteSettings)

lazy val siteSettings = Seq(
  micrositeName := "",
  micrositeDescription := "Extreme Programming Dojo",

  micrositeHomepage := "https://xpdojo.org",
  micrositeAuthor := "Toby, Ben, Pete and others",
  micrositeGithubOwner := "xp-dojo",
  micrositeGithubRepo := "xp-dojo",
  micrositeDocumentationLabelDescription := "Study Materials",
  micrositeHighlightTheme := "atom-one-light",
  micrositeDocumentationUrl := "/docs",
  micrositeGitterChannel := true,
  micrositeGitterChannelUrl := "xp-dojo/community",
  micrositeShareOnSocial := false,

  micrositePalette := Map(
    "brand-primary"   -> "#5b5988",   // selected sidebar (docs page), hyperlinks
    "brand-secondary" -> "#848d98",   // front page button color and "technologies" background
    "brand-tertiary"  -> "#364252",   // top left (docs page)
    "gray-dark"       -> "#7b7b7e",   // headings
    "gray"            -> "#7b7b7e",   // text
    "gray-light"      -> "#e5e5e6",   // badge background, border
    "gray-lighter"    -> "#f4f3f4",   // page background including code samples
    "white-color"     -> "#eeeeee"    // was "#FFFFFF"
  ),

  fork in tut := true
)
