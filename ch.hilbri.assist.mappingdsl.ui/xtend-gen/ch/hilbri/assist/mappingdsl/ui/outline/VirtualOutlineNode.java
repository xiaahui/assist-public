package ch.hilbri.assist.mappingdsl.ui.outline;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.AbstractOutlineNode;

@SuppressWarnings("all")
public class VirtualOutlineNode extends AbstractOutlineNode {
  protected VirtualOutlineNode(final IOutlineNode parent, final ImageDescriptor imgDesc, final Object text, final boolean isLeaf) {
    super(parent, imgDesc, text, isLeaf);
  }
}
