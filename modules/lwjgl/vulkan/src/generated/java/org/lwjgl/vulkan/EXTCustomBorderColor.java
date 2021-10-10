/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension provides cross-vendor functionality to specify a custom border color for use when the sampler address mode {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER} is used.
 * 
 * <p>To create a sampler which uses a custom border color set {@link VkSamplerCreateInfo}{@code ::borderColor} to one of:</p>
 * 
 * <ul>
 * <li>{@link #VK_BORDER_COLOR_FLOAT_CUSTOM_EXT BORDER_COLOR_FLOAT_CUSTOM_EXT}</li>
 * <li>{@link #VK_BORDER_COLOR_INT_CUSTOM_EXT BORDER_COLOR_INT_CUSTOM_EXT}</li>
 * </ul>
 * 
 * <p>When {@link #VK_BORDER_COLOR_FLOAT_CUSTOM_EXT BORDER_COLOR_FLOAT_CUSTOM_EXT} or {@link #VK_BORDER_COLOR_INT_CUSTOM_EXT BORDER_COLOR_INT_CUSTOM_EXT} is used, applications must provide a {@link VkSamplerCustomBorderColorCreateInfoEXT} in the {@code pNext} chain for {@link VkSamplerCreateInfo}.</p>
 * 
 * <h5>VK_EXT_custom_border_color</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_custom_border_color}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>288</dd>
 * <dt><b>Revision</b></dt>
 * <dd>12</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Special Uses</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">D3D support</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Liam Middlebrook <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_custom_border_color]%20@liam-middlebrook%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_custom_border_color%20extension%3E%3E">liam-middlebrook</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-04-16</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton, Valve</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Philip Rebohle, Valve</li>
 * <li>Liam Middlebrook, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Spencer Fricke, Samsung Electronics</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Jesse Hall, Google</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Tom Olson, ARM</li>
 * <li>Stuart Smith, Imagination Technologies</li>
 * <li>Donald Scorgie, Imagination Technologies</li>
 * <li>Alex Walters, Imagination Technologies</li>
 * <li>Peter Quayle, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTCustomBorderColor {

    /** The extension specification version. */
    public static final int VK_EXT_CUSTOM_BORDER_COLOR_SPEC_VERSION = 12;

    /** The extension name. */
    public static final String VK_EXT_CUSTOM_BORDER_COLOR_EXTENSION_NAME = "VK_EXT_custom_border_color";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT        = 1000287000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT = 1000287001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT   = 1000287002;

    /**
     * Extends {@code VkBorderColor}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BORDER_COLOR_FLOAT_CUSTOM_EXT BORDER_COLOR_FLOAT_CUSTOM_EXT}</li>
     * <li>{@link #VK_BORDER_COLOR_INT_CUSTOM_EXT BORDER_COLOR_INT_CUSTOM_EXT}</li>
     * </ul>
     */
    public static final int
        VK_BORDER_COLOR_FLOAT_CUSTOM_EXT = 1000287003,
        VK_BORDER_COLOR_INT_CUSTOM_EXT   = 1000287004;

    private EXTCustomBorderColor() {}

}