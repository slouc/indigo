package indigojs.delegates.formats

import indigo.shared.datatypes.Depth
import indigojs.delegates._
import indigoextras.formats._
import scala.scalajs.js.annotation._
import scala.scalajs.js.JSConverters._
import scala.scalajs.js

import indigojs.delegates.formats.AsepriteConverterUtilities._
import indigojs.delegates.SceneGraphNodeUtilities._
import indigojs.delegates.AnimationUtilities._
import indigo.shared.assets.AssetName

@JSExportTopLevel("SpriteAndAnimations")
final case class SpriteAndAnimationsDelegate(sprite: SpriteDelegate, animations: AnimationDelegate) {

}


@JSExportTopLevel("AsepriteConverter")
object AsepriteConverterDelegate {

  @SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Nothing"))
  @JSExport
  def toSpriteAndAnimations(dice: DiceDelegate, aseprite: AsepriteDelegate, depth: Int, assetName: String): js.UndefOr[SpriteAndAnimationsDelegate] =
    AsepriteConverter.toSpriteAndAnimations(dice.toInternal, aseprite.toInternal, Depth(depth), AssetName(assetName)) match {
      case None =>
        None.orUndefined
      case Some(x) => Some(x.toJsDelegate).orUndefined
    }

  def extractCycles(aseprite: AsepriteDelegate): js.Array[CycleDelegate] =
    AsepriteConverter.extractCycles(aseprite.toInternal).map(_.toJsDelegate).toList.toJSArray
}

object AsepriteConverterUtilities {
    implicit class SpriteAndAnimationsConvert(val obj: SpriteAndAnimations) {
        def toJsDelegate =
            SpriteAndAnimationsDelegate(
                obj.sprite.toJsDelegate,
                obj.animations.toJsDelegate
            )
    }
}
